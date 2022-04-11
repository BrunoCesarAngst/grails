<template id="add-veiculo-template" xmlns="http://www.w3.org/1999/xhtml">
  <div>
    <veiculo-form-header/> 

    <div id="inputRow" class="row">
      <div class="col-sm-3">
        <div class="input-group">
          <input type="text" class="form-control" placeholder="Enter a name..." v-model="veiculo.nome"> 
        </div>
      </div>
      <div class="col-sm-7">
        <div class="row">
          <div class="col-sm-4">
            <field-select v-model="veiculo.condutor" :field="'Condutor'" :values="condutores"></field-select> 
          </div>
          <div class="col-sm-4">
            <field-select v-model="veiculo.fabricante" :field="'Fabricante'" :values="fabricantes"></field-select>
          </div>
          <div class="col-sm-4">
            <field-select v-model="veiculo.modelo" :field="'Modelo'" :values="modelos"></field-select>  
          </div>          
        </div>
      </div>
      <div class="col-sm-2">
        <div class="btn-group" role="group" aria-label="Add new veiculo">
          <button type="button" class="btn btn-success" @click="submit()">Adicionar à Garagem</button> 
        </div>
      </div>
    </div>
  </div>

</template>

<script>
import VeiculoFormHeader from './VeiculoFormHeader'
import FieldSelect from './FieldSelect'

export default {
  props: ['veiculo', 'fabricantes', 'modelos', 'condutores'], 
  model: {
    prop: 'veiculo', 
    event: 'change'
  },
  components: {
    VeiculoFormHeader,
    FieldSelect
  },
  methods: {
    submit () { 
      this.$emit('submit')
    }
  }
}
</script>

<style>
  /* Add custom rules here */
</style>

