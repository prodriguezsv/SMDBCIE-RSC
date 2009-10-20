package ontology.common.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.common.*;

/**
* Protege name: EnvironmentalCategory
* @author ontology bean generator
* @version 2009/10/20, 13:36:12
*/
public class DefaultEnvironmentalCategory implements EnvironmentalCategory, Introspectable {

  private static final long serialVersionUID = 2105474187493131833L;

  private String _internalInstanceName = null;

  public DefaultEnvironmentalCategory() {
    this._internalInstanceName = "";
  }

  public DefaultEnvironmentalCategory(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: definition
   */
   private String definition;
   public void setDefinition(String value) { 
    this.definition=value;
   }
   public String getDefinition() {
     return this.definition;
   }

   /**
   * Protege name: term
   */
   private String term;
   public void setTerm(String value) { 
    this.term=value;
   }
   public String getTerm() {
     return this.term;
   }

   /**
   * Protege name: owns
   */
   private List owns = new ArrayList();
   public void addOwns(Attribute elem) { 
     owns.add(elem);
   }
   public boolean removeOwns(Attribute elem) {
     boolean result = owns.remove(elem);
     return result;
   }
   public void clearAllOwns() {
     owns.clear();
   }
   public Iterator getAllOwns() {return owns.iterator(); }
   public List getOwns() {return owns; }
   public void setOwns(List l) {owns = l; }

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(CommonTerminologyOntology.ENVIRONMENTALCATEGORY_DEFINITION, (AbsTerm) onto.fromObject(getDefinition()));
      abs.set(CommonTerminologyOntology.ENVIRONMENTALCATEGORY_TERM, (AbsTerm) onto.fromObject(getTerm()));
      abs.set(CommonTerminologyOntology.ENVIRONMENTALCATEGORY_OWNS, (AbsTerm) onto.fromObject(getOwns()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising EnvironmentalCategory");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      definition = (String)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.ENVIRONMENTALCATEGORY_DEFINITION));
      term = (String)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.ENVIRONMENTALCATEGORY_TERM));
      owns = (List)onto.toObject(abs.getAbsObject(CommonTerminologyOntology.ENVIRONMENTALCATEGORY_OWNS));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising EnvironmentalCategory");
     }
   }

}
