package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* Protege name: AreReasonableSolutionsTo
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface AreReasonableSolutionsTo extends jade.content.Predicate, Introspectable {

   /**
   * Protege name: problem
   */
   public void setProblem(Problem value);
   public Problem getProblem();

   /**
   * Protege name: proposedSolutions
   */
   public void addProposedSolutions(ProposedSolution elem);
   public boolean removeProposedSolutions(ProposedSolution elem);
   public void clearAllProposedSolutions();
   public Iterator getAllProposedSolutions();
   public List getProposedSolutions();
   public void setProposedSolutions(List l);

}
