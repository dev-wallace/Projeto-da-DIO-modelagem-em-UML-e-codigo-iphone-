public class iphone implements navegadorInternet, ReprodutorMusical, aparelhoTelefônico {
    public void ligar (String numero ){
        System.out.println("Ligando para " +numero);

    }

    public void atender (){
        System.out.println("Atendendo ligacao...");

    }
   public void iniciarCorreioVoz(){
System.out.println("iniciando correio de voz ");

   }
    public void tocar (){
        System.out.println("Reproduzindo musica...");

    }

    public void pausar (){
System.out.println("Musica pausada...");
    }
    public void selecionarMusica(String musica){
        System.out.println("selecionando " +musica );


    }

   public void exibirPagina(String url) {

        if(validarConectadoInternet() == false ){
            System.out.println("Sem conexao com a internet ");
        }
        if (url == null){
            System.out.println("A URL fornecida nao e valida ");
        }

        System.out.println("Exibindo pagina:" +url);
    }
    // metodo para validar a conexao do usuario 
    private boolean validarConectadoInternet () {
        return true;
    }
    //URL Padrao para novas abas 
    private void urlPadrao () {
        
    }

    public void atualizarPagina(){
        
        if(validarConectadoInternet() == false ){
            System.out.println("Sem conexao com a internet ");
        }
        
        System.out.println("atulizando pagina");
    }

    public void adicionarNovaAba(){
        if(validarConectadoInternet() == false ){
            System.out.println("Sem conexao com a internet ");
        }
        
        urlPadrao();
        System.out.println("Adicionando nova aba ");
    }
    


    }

