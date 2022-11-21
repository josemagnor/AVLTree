package com.ufc.model.service;

public class Service {
    int serviceOrder;
    private String serviceDescription;
    private int quantity;
    private enum Status{CANCELED, FINALIZADED, PROCESSING}
    private enum modality{presencial,distance};

	/*
	Cada usuário possuirá um arranjo dos seus serviços pedidos no sistema, cujas as
	informações armazenadas são: número de identificação (ordem de serviço – OS), descrição do
	serviço solicitado (por exemplo: manutenção de ar-condicionado, limpeza, pintura, reposição de
	material, entre outros), quantidade e status (cancelado, finalizado, ou em processamento).
	Buscando manter a uniformidade do sistema, cada serviço deve possuir uma chave única que o
	identifica (OS).
	*/

    //parameterized constructor
 
    //default constructor to create null node
    
    public Service ()  
    {  
      
    }

    public Service(int serviceOrder, String serviceDescription, int quantity) 
    {
	this.serviceOrder = serviceOrder;
	this.serviceDescription = serviceDescription;
	this.quantity = quantity;
	
    }       
}
