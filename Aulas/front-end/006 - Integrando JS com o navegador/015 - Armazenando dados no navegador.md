# JS na Web: Armazenando dados no navegador
- Os inputs podem ser diferentes de acordo com cada browser, nossa intenção como dev é de pradonizar a experiência do usuário.
- `moment.js` é uma biblioteca para padronização de datas.
- `https://cdnjs.com` é uma boa alternative para ver bibliotecas JS.
- O objeto `Date()` possui vários métodos para lidar com datas.
- Por exemplo, se quisermos editar essa primeira informação para um formato que vai exibir a data separada por barra podemos usar o método `toLocaleDateString`
  - `data.toLocaleDateString('pt-BR')`
- Podemos criar um objeto com as chaves e valores das opções de data que queremos tb e passá-lo como segundo parâmetro.
- `toLocaleTimeString()` funciona de maneira similar.
- Se precisarmos usar essa formatação em vários lugares do código, podemos utilizar o objeto `Intl.DateTimeFormat` que é um construtor, ou seja, ele vai receber informações iniciais de como queremos que a data esteja formatada.
- Desestruturação é uma expressão do JavaScript que torna possível "desembalar" valores dos arrays ou propriedades de objetos em variáveis distintas. Ou seja, podemos extrair dados dos arrays e dos objetos e atribuí-los às variáveis
  - Segue a sintaxe `const {variavel} = fornecedor;`, exemplo: `const {a:nome, b:idade, c:email} = json;`
- O Web Storage API implementa duas interfaces: sessionStorage e localStorage para armazenamento de dados através de chave/valor.
- `JSON.stringify` converte o objeto para string, assim podemos armazená-los e recuperá-lo.
- Usamos Rest e spread quando temos um número interminado de argumentos. ` const outrosItens = [ ...primeirosItens, 4, 5, 6 ]`
- Podemos usar operadores de curto circuito para dar outro retorno em caso de falha, exemplo: `const tarefas = JSON.parse(localStorage.getItem('tarefas')) || [ ]`
- `JSON.parse` lê o JSON e retorna um objeto.
- A função `sort` por padrão usa Unicode e portanto não ordena números muito bem, para tal basta fazer `.sort(function(a, b){return a - b});`
- Podemos remover dados do LocalStorage com o `splice(indice, quantidade)`