package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: AreReasonableSolutionsTo
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultAreReasonableSolutionsTo implements AreReasonableSolutionsTo, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultAreReasonableSolutionsTo() {
    this._internalInstanceName = "";
  }

  public DefaultAreReasonableSolutionsTo(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: problem
   */
   private Problem problem;
   public void setProblem(Problem value) { 
    this.problem=value;
   }
   public Problem getProblem() {
     return this.problem;
   }

   /**
   * Protege name: proposedSolutions
   */
   private List proposedSolutions = new ArrayList();
   public void addProposedSolutions(ProposedSolution elem) { 
     proposedSolutions.add(elem);
   }
   public boolean removeProposedSolutions(ProposedSolution elem) {
     boolean result = proposedSolutions.remove(elem);
     return result;
   }
   public void clearAllProposedSolutions() {
     proposedSolutions.clear();
   }
   public Iterator getAllProposedSolutions() {return proposedSolutions.iterator(); }
   public List getProposedSolutions() {return proposedSolutions; }
   public void setProposedSolutions(List l) {proposedSolutions = l; }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      abs.set(CBRTerminologyOntology.AREREASONABLESOLUTIONSTO_PROBLEM, (AbsTerm) onto.fromObject(getProblem()));
      abs.set(CBRTerminologyOntology.AREREASONABLESOLUTIONSTO_PROPOSEDSOLUTIONS, (AbsTerm) onto.fromObject(getProposedSolutions()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising AreReasonableSolutionsTo");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      problem = (Problem)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.AREREASONABLESOLUTIONSTO_PROBLEM));
      proposedSolutions = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.AREREASONABLESOLUTIONSTO_PROPOSEDSOLUTIONS));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising AreReasonableSolutionsTo");
     }
   }

}
