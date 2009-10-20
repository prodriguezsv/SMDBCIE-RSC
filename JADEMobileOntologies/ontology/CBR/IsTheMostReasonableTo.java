package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: IsTheMostReasonableTo
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface IsTheMostReasonableTo extends jade.content.Predicate, Introspectable {

   /**
   * Protege name: problem
   */
   public void setProblem(Problem value);
   public Problem getProblem();

   /**
   * Protege name: proposedSolution
   */
   public void setProposedSolution(ProposedSolution value);
   public ProposedSolution getProposedSolution();

}
