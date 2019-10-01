
package pkg2120180178.sk02.pbo.ti20192020.pkg3.pkg4.pkg02;

public class SK02PBOTI201920203402 {

    public static void main(String[] args) {
        FACEBOOK Facebook = new FACEBOOK();
        Facebook.pesan=100;        
        Facebook.pemberitahuan=10;       
        Facebook.telefon=25;        
        System.out.println(Facebook.nama);
        System.out.println("pesan anda sekarang "+Facebook.pesan);
        System.out.println("Anda tidak menjawab "+Facebook.telefon);
        System.out.println("Pemberitahuan facebook anda "+Facebook.pemberitahuan);
        Facebook.megirimGambar();
        Facebook.mengirimPesan(4, 2);
        Facebook.mengirimVideo(300);
        Facebook.grup(250);
    }
}