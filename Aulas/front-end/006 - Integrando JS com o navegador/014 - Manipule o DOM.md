# JS na Web: Manipule o DOM com JavaScript
- O objeto `document` representa a página atual e atrás dele que acessamos e manipulamos o DOM (Document Object Model)
- A estrutura do DOM inicia com o `Window` representando a janela, o `Document` representando a página atual e logo abaixo dele a estrutura `<html>`
  - `document.getElementById(‘id’)` seleciona o elemento pelo id passado.
  - `document.getElementsByClassName(‘classe’)` retorna um array dos elementos pelo nome da classe passada.
  - `document.getElementsByTagName(‘tag’)` retorna um array dos elementos pelo nome da tag passada
  - `document.querySelectorAll(seletor)` devolve todos os seletores com o mesmo nome
- Os data atributes permitem a manipulação dos elementos em JS sem entrar em conflito com estilização CSS por exemplo, já que os atributos HTMl não foram feitos para guardar informações.
- Para selecionar data atributes, usamos `[]`
- `Element.addEventListener('tipo', listener)` adiciona quando o tipo de evento foi realizado e retornar para o listener(que pode ser uma função)
- Template strings são chamadas por (\`)  no JS.
  - `appendChild(filho)`  sempre é adicionado no final do nó, para colocar um nó filho dentro do nó pai
  - `insertBefore(pai, filho)` Coloca um nó antes do outro.
  - `replaceChild( elemento1, elemento2)` Substitui o nó elemento 1 pelo nó elemento2.
  - `removeChild(elemento)` Remove um nó da árvore.
  - `evento.target` para onde o evento foi realizado.
  - `parentElement` para selecionar o pai, onde foi realizada aquela chamada.
- Se deixarmos as funções no escopo global, elas podem ser acessadas no navegador, podemos englobá-la com a `IIFE`(Immediately Invoked Function Expression) para evitar isso.
- Podemos resolver isso transformando em ódulo e usando o `export default metodo`, `export {metodo1, metodo2}` ou `export` diretamente na chamada.
- CORS serve para permitir o uso de informações de outros destinos, uma flexibidade na Same Origin Police.