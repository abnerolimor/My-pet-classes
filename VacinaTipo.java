import java.sql.Date;

public class VacinaTipo {

    public Date dataVacina;
    public String idadeVacina;

//---------------------------------------Encapsulamento Telefone ----------------------------------------------//
 public Date getdataVacina(){
    return this.dataVacina;
}

public void setdataVacina( Date dataVacina ){
 this.dataVacina = dataVacina;
}

//---------------------------------------Encapsulamento Telefone ----------------------------------------------//
public String getidadeVacina(){
    return this.idadeVacina;
}

public void setidadeVacina( String idadeVacina ){
 this.idadeVacina = idadeVacina;
}

    
}
