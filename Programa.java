import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

 //---------------------------------------Informaçoes do pet ----------------------------------------------//
       
      Pet pet = new Pet(); // declarando o objeto pet
      Scanner ScPet = new Scanner(System.in); // scanner para o pet

        System.out.println("Digite o nome de pet:");
        pet.setNome(ScPet.nextLine());

        System.out.println("Digite a raça:");
        pet.setIdade(ScPet.nextInt());

        System.out.println("Digite a idade:");
        pet.setRaca(ScPet.nextLine());

        System.out.println("Digite o  Porte:");
        pet.setPorte(ScPet.nextLine());

        System.out.println("Digite o sexo:");
        pet.setSexo(ScPet.nextLine());

        // System.out.println("Digite o seu titulo para a foto:"); necessita revisar
        // pet.setFotoPet(ScPet.nextLine());

        ScPet.close(); // fechando o scanner do pet

//---------------------------------------Informaçoes do responsavel ----------------------------------------------//
       
        Responsavel responsavel = new Responsavel(); // declarando o objeto responsavel
        Scanner ScResponsavel = new Scanner(System.in); // scanner para o responsavel

        System.out.println("Digite o seu nome :");
        responsavel.setNome(ScResponsavel.nextLine());

        System.out.println("Digite o seu email :");
        responsavel.setEmail(ScResponsavel.nextLine());

        System.out.println("Digite o seu telefone :");
        responsavel.setTelefone(ScResponsavel.nextLine());

        ScResponsavel.close(); // fechando o scanner do responsavel

//---------------------------------------Preenchimento endereco ----------------------------------------------//      

        Endereco endereco = new Endereco(); // declarando o objeto endereco
        Scanner ScEndereco = new Scanner(System.in); // scanner para o endereco

        System.out.println("Digite o seu endereço:");
        endereco.setRua(ScEndereco.nextLine());
        
        System.out.println("Digite o seu número:");
        endereco.setNum(ScEndereco.nextLine());

        System.out.println("Digite o seu bairro:");
        endereco.setBairro(ScEndereco.nextLine());

        ScEndereco.close(); // fechando o scanner do endereco

//---------------------------------------Preenchimento vacina ----------------------------------------------//

        Vacina vacina = new Vacina(); // declarando o objeto vacina
        Scanner ScVacina = new Scanner(System.in); // scanner para o vacina

        System.out.println("Digite o nome da vacina:");
        vacina.setnomeVacina(ScVacina.nextLine());

        ScVacina.close(); // fechando o scanner do vacina

//---------------------------------------Preenchimento Historico ----------------------------------------------//

        Historico historico = new Historico(); // declarando o objeto historico
        Scanner ScHistorico = new Scanner(System.in); // scanner para o historico

        System.out.println("Digite o nome da vacina tomada anteriormente:");
        historico.setProximaVacina(ScHistorico.nextLine());

        System.out.println("Digite a data da vacina que foi tomada:");
        historico.setDataVacina(ScHistorico.nextLine());

        ScHistorico.close(); // fechando o scanner do historico

//---------------------------------------Preenchimento agenda ----------------------------------------------//
       
        Agenda agendapet = new Agenda(); // declarando o objeto agendapet
       Scanner ScAgendapet = new Scanner(System.in); // scanner para o agendapet

        System.out.println("Digite o seu email:");
        agendapet.setTosa(ScAgendapet.nextLine());

        System.out.println("Digite seu telefone:");
        agendapet.setBanho(ScAgendapet.nextLine());

        System.out.println("Digite o seu CNPJ:");
        agendapet.setCheckUp(ScAgendapet.nextLine());

        ScAgendapet.close(); // fechando o scanner do agendapet

//---------------------------------------informacao petshop ----------------------------------------------//
        PetShop petShop = new PetShop(); // declarando o objeto petshop
        Scanner ScPetShop = new Scanner(System.in); // scanner para o petshop

        System.out.println("Digite o nome do petshop:");
        petShop.setNome(ScPetShop.nextLine());

        System.out.println("Digite o email do petshop:");
        petShop.setEmail(ScPetShop.nextLine());

        System.out.println("Digite o telefone do petshop:");
        petShop.setTelefone(ScPetShop.nextLine());

        System.out.println("Digite o CNPJ do petshop:");
        petShop.setCnpj(ScPetShop.nextLine());

        ScPetShop.close(); // fechando o scanner do petshop

                }
        }