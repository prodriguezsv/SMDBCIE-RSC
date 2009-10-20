package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;

/**
* Protege name: Hypothesis
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface Hypothesis extends jade.content.Concept, Introspectable {

   /**
   * Protege name: justification
   */
   public void setJustification(Description value);
   public Description getJustification();

   /**
   * Protege name: description
   */
   public void setDescription(Description value);
   public Description getDescription();

   /**
   * Protege name: possibleSolutions
   */
   public void addPossibleSolutions(PossibleSolution elem);
   public boolean removePossibleSolutions(PossibleSolution elem);
   public void clearAllPossibleSolutions();
   public Iterator getAllPossibleSolutions();
   public List getPossibleSolutions();
   public void setPossibleSolutions(List l);

   /**
   * Protege name: unmatchedDescription
   */
   public void setUnmatchedDescription(Description value);
   public Description getUnmatchedDescription();

}
