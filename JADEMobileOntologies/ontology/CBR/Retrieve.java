package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: Retrieve
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface Retrieve extends jade.content.AgentAction, Introspectable {

   /**
   * Protege name: similarTo
   */
   public void setSimilarTo(Problem value);
   public Problem getSimilarTo();

}
