# Projeto-da-DIO-modelagem-em-UML-e-codigo-iphone-
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar ( )
+pausar ( )
selecionarMusica (String musica)
    }

    class AparelhoTelefonico {
   +ligar ( )
+atender ( )
+iniciarCorreiosVoz ( )
    }

    class NavegadorInternet {
      

+exibirPagina(String url)
+adicionarNovaAba ( )
+atualizarPagina ( )
-urlPadrao ( )
-validarConectadoInternet ( )

    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
