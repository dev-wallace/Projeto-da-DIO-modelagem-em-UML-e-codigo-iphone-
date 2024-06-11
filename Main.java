public class Main {
    public static void main(String[] args) {

iphone IphoneDoGabriel = new iphone();
        //funcionalidade do navegador de internet
    IphoneDoGabriel.exibirPagina("www.exemplo.com");
        IphoneDoGabriel.atualizarPagina();
       IphoneDoGabriel.adicionarNovaAba();
     
       //Testando as funcionalidades aparelho telefonico
    IphoneDoGabriel.ligar("456-7890");
    IphoneDoGabriel.atender();
    IphoneDoGabriel.iniciarCorreioVoz();
//fucionalidades do reprodutor de musica 
    IphoneDoGabriel.tocar();
    IphoneDoGabriel.pausar();
    IphoneDoGabriel.selecionarMusica("ASTROTHUNDER");

   
     }



}