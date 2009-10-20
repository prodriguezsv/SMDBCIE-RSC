package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* Protege name: AreSelectedSolutionsTo
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface AreSelectedSolutionsTo extends jade.content.Predicate, Introspectable {

   /**
   * Protege name: to
   */
   public void setTo(Problem value);
   public Problem getTo();

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
