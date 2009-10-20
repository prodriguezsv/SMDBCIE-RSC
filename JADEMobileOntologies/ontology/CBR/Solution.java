package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: Solution
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface Solution extends jade.content.Concept, Introspectable {

   /**
   * Protege name: justification
   */
   public void setJustification(Description value);
   public Description getJustification();

   /**
   * Protege name: name
   */
   public void setName(String value);
   public String getName();

   /**
   * Protege name: rank
   */
   public void setRank(String value);
   public String getRank();

}
