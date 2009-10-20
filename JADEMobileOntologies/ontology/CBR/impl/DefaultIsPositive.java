package ontology.CBR.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.CBR.*;

/**
* Protege name: IsPositive
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public class DefaultIsPositive implements IsPositive, Introspectable {

  private static final long serialVersionUID = 3465529875766262740L;

  private String _internalInstanceName = null;

  public DefaultIsPositive() {
    this._internalInstanceName = "";
  }

  public DefaultIsPositive(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: case
   */
   private Case case;
   public void setCase(Case value) { 
    this.case=value;
   }
   public Case getCase() {
     return this.case;
   }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      abs.set(CBRTerminologyOntology.ISPOSITIVE_CASE, (AbsTerm) onto.fromObject(getCase()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising IsPositive");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsPredicate abs = (AbsPredicate) absObj;
      case = (Case)onto.toObject(abs.getAbsObject(CBRTerminologyOntology.ISPOSITIVE_CASE));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising IsPositive");
     }
   }

}
