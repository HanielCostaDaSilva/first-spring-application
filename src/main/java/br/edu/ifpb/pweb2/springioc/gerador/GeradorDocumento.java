package br.edu.ifpb.pweb2.springioc.gerador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import br.edu.ifpb.pweb2.springioc.paragrafo.GeradorParagrafoIntf;


@Component
public class GeradorDocumento implements GeradorDocumentoIntf {

    @Autowired
    @Qualifier("geradorParagrafoPdf")
   GeradorParagrafoIntf geradorParagrafo;
    
    @Override
     public void addTexto(String texto){
      geradorParagrafo.addParagrafo(texto);

     }
}