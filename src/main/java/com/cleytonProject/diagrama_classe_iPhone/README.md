# 📱 Desafio - Diagramação de classes do iPhone

## 📋 Descrição
Pormovido pela **Digital Innovation One** na parceria com o **Santander**, como parte _Santander
Bootcamp 2023 - Backend Java_, que também teve a parceria com a **GFT** e **AWS** no âmbito do Bootcamp _Desenvolvimento Java com Cloud
AWS_. **Como desafio é iplementar de forma detalhada e precisa as funcionalidades de um iPhone.**

É apresentado os princípios da programação orientada a objetos e técnicas de modelagem UML onde foi criada a  estrutura
para permitir que um dispositivo iPhone desempenhe três funções distintas e iportantes: **Reprodutor Musical**, **Aparelho
Telefônico** e **Navegador na Internet**.




## 📊 Diagrama UML

  <img src="https://i.imgur.com/mhMmDZn.png">

### `iPhone`

Uma classe pricipal`iPhone` para representar o dispositivo, que implementa as interfaces
`ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`. o que disponibiliza ao iPhone desempenhe os papéis
de reprodutor musical, aparelho telefônico e navegador na Internet.

### `ReprodutorMusical`

Uma interface `ReprodutorMusical` definindo métodos necessários para controlar a reprodução de música, como `tocar()`,
`pausar()` e `selecionarMusica()`. As classes implementadoras da interface são capazes de reproduzir músicas.

### `AparelhoTelefonico`

Uma interface `AparelhoTelefonico` definindo métodos para realizar chamadas telefônicas e enviar mensagens, incluindo
`ligar()`, `atender()` e `iniciarCorreioVoz()`. As classes implementadoras da interface podem funcionam como
dispositivos telefônicos.

### `NavegadorInternet`

Uma interface `NavegadorInternet` definindo métodos para a navegação na web, como `exibirPagina()`, `adicionarNovaAba()`
e `atualizarPagina()`. As classes implementadoras da interface podem atuam como navegadores da Internet.

