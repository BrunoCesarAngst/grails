<template id="fulltable-template" xmlns="http://www.w3.org/1999/xhtml">
  <table class="table">
    <thead class="thead-inverse">
      <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>Condutor</th>
        <th>Fabricante</th>
        <th>Modelo</th>
      </tr>
    </thead> 
      <table-row v-for="veiculo in veiculos"
                 :item="veiculo" :key="veiculo.id"></table-row> 
  </table>
</template>

<script>
import TableRow from './TableRow.vue' 

export default {
  props: ['veiculos'],
  components: { 
    TableRow
  }
}
</script>

<style>
  /* Add custom rules here */
</style>