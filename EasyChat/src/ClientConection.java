import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientConection {
    public static void main(String[] args) throws IOException {
        Client client = new Client("Valter",InputController.getClassClientId(),new Socket("127.0.0.1",12345));
        System.out.println("Conectado ao servidor");
        System.out.println("Seu id é: " + client.getId() + ". Ele não é permanente, "
                + "e provalvelmente será diferente na próxima conexão");

       String file = FileConfig.createFile("Cliente-" + client.getName());
        InputStream clientInput = client.getConnection().getInputStream();
        OutputStream clientOutput = client.getConnection().getOutputStream();

        PrintStream noArquivo = new PrintStream(file);
        PrintStream noServer = new PrintStream("ServerData.txt");
        PrintStream saida = new PrintStream(clientOutput);

        Scanner teclado = new Scanner(System.in);
        Scanner chat = new Scanner(clientInput);

        if (client.getId() == 0) {
            Scanner tecladoServer = new Scanner(System.in);

            while (tecladoServer.hasNextLine()) {
                noServer.println("client: "
                        + client.getName()
                        + " " + tecladoServer.nextLine());
                tecladoServer.close();
            }
            while (chat.hasNextLine()){
                noArquivo.println("Server: " + chat.nextLine());
            }
        }

        for(int i = 0; i <= InputController.getClassClientId(); i++){

            if (contato.equals(i)){
                break;
            } else if(Long.parseLong(contato.next()) > InputController.getClassClientId()){
                System.out.println("O id informado não foi encontrado");
            }
        }

        PrintStream saidaContato = new PrintStream("Cliente"+ contato + ".txt");
        while (teclado.hasNextLine()){
            saidaContato.println(teclado.hasNextLine());
        }
            contato.close();
            saidaContato.close();
            noArquivo.close();
            saida.close();
            teclado.close();
    }
}
