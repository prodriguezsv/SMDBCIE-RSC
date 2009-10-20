package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.CBR.*;

/**
* Protege name: AreSelectedSolutionsTo
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultAreSelectedSolutionsTo implements AreSelectedSolutionsTo, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultAreSelectedSolutionsTo() {
    this._internalInstanceName = "";
  }

  public DefaultAreSelectedSolutionsTo(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: to
   */
   private Problem to;
   public void setTo(Problem value) { 
    this.to=value;
   }
   public Problem getTo() {
     return this.to;
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
      abs.set(CBRTerminologyOntology.ARESELECTEDSOLUTIONSTO_TO, (AbsTerm) onto.fromObject(getTo()));
      abs.set(CBRTerminologyOntology.ARESELECTEDSOLUTIONSTO_PROPOSEDSOLUTIONS, (AbsTerm) onto.fromObject(getProposedSolutions()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising AreSelectedSolutionsTo");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      to = (Problem)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.ARESELECTEDSOLUTIONSTO_TO));
      proposedSolutions = (List)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.ARESELECTEDSOLUTIONSTO_PROPOSEDSOLUTIONS));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising AreSelectedSolutionsTo");
     }
   }

}
