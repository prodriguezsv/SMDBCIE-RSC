package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Define the terms utilized in the taxonomic  hierarchy
* Protege name: DefinedTerm
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface DefinedTerm extends jade.content.Concept, Introspectable {

   /**
   * Protege name: definition
   */
   public void setDefinition(String value);
   public String getDefinition();

   /**
   * Protege name: term
   */
   public void setTerm(String value);
   public String getTerm();

}
