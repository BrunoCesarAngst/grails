<template id="tablerow-template" xmlns="http://www.w3.org/1999/xhtml">
    <tr> <!-- 1 -->
      <td>{{ item.id }}</td>
      <td>{{ item.nome }}</td>
      <td>{{ item.condutor.nome }}</td>
      <td>{{ item.fabricante.nome }}</td>
      <td>{{ item.modelo.nome }}</td>
    </tr>
</template>

<script>
export default {
  props: ['item'] 
}
</script>

<!-- Per Component Custom CSS Rules -->
<style>
  /* Add custom rules here */
</style>