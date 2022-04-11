
<template>
  <div id="garage">
    <app-header></app-header>
    <veiculo-form v-model="veiculo"
                  :condutores="condutores"
                  :fabricantes="fabricantes"
                  :modelos="modelos"
                  @submit="submitNewVeiculo()">

    </veiculo-form>
    <veiculo-table :veiculos="veiculos"></veiculo-table>
  </div>
</template>

<script>
  import AppHeader from './AppHeader'
  import VeiculoForm from './form/VeiculoForm'
  import VeiculoTable from './table/VeiculoTable'

  export default {
    components: {
      AppHeader,
      VeiculoForm,
      VeiculoTable
    },
    data: function () {
      return {
        veiculos: [],
        veiculo: {nome: '', condutor: null, fabricante: null, modelo: null},
        condutores: [],
        fabricantes: [],
        modelos: [],
        serverURL: process.env.VUE_APP_SERVER_URL
      }
    },
    created () {
      this.fetchData()
    },
    methods: {
      fetchData: async function () {
        try {
          await Promise.all([
            this.fetchVeiculos(),
            this.fetchCondutores(),
            this.fetchFabricantes(),
            this.fetchModelos(),
          ])
        } catch (error) {
          console.log(error)
        }
      },
      fetchVeiculos: function () {
        fetch(`${this.serverURL}/veiculo`)
          .then(r => r.json())
          .then(json => { this.veiculos = json })
          .catch(error => console.error('Recuperação de erro veiculos: ' + error))
      },
      fetchCondutores: function () {
        fetch(`${this.serverURL}/condutor`)
          .then(r => r.json())
          .then(json => { this.condutores = json })
          .catch(error => console.error('Recuperação de erro condutores: ' + error))
      },
      fetchFabricantes: function () {
        fetch(`${this.serverURL}/fabricante`)
          .then(r => r.json())
          .then(json => { this.fabricantes = json })
          .catch(error => console.error('Recuperação de erro fabricantes: ' + error))
      },
      fetchModelos: function () {
        fetch(`${this.serverURL}/modelo`)
          .then(r => r.json())
          .then(json => { this.modelos = json })
          .catch(error => console.error('Recuperação de erro modelos: ' + error))
      },
      submitNewVeiculo: function () {
        const veiculo = this.veiculo
        fetch(`${this.serverURL}/veiculo`, {
          method: 'POST',
          headers: {'Content-Type': 'application/json'},
          body: JSON.stringify(veiculo)
        }).then(r => r.json())
          .then(json => {
            this.veiculos.push(json)
            this.veiculo = {nome: '', condutor: null, fabricante: null, modelo: null}
          })
          .catch(ex => console.error('Impossível salvar veiculo', ex))
      }
    }
  }
</script>

<!-- Per Component Custom CSS Rules -->
<style>
  #garage {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    text-align: center;
    color: #2c3e50;
  }
</style>