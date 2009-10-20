package ontology.taxonomy.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import jade.util.leap.*;
import ontology.taxonomy.*;

/**
* It's a subclass of a defined term
* Protege name: Structure
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public class DefaultStructure implements Structure, Introspectable {

  private static final long serialVersionUID = 8335714681696847814L;

  private String _internalInstanceName = null;

  public DefaultStructure() {
    this._internalInstanceName = "";
  }

  public DefaultStructure(String instance_name) {
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

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(TaxonomyOntology.STRUCTURE_DEFINITION, (AbsTerm) onto.fromObject(getDefinition()));
      abs.set(TaxonomyOntology.STRUCTURE_OWNS, (AbsTerm) onto.fromObject(getOwns()));
      abs.set(TaxonomyOntology.STRUCTURE_TERM, (AbsTerm) onto.fromObject(getTerm()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising Structure");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      definition = (String)onto.toObject(abs.getAbsObject(TaxonomyOntology.STRUCTURE_DEFINITION));
      owns = (List)onto.toObject(abs.getAbsObject(TaxonomyOntology.STRUCTURE_OWNS));
      term = (String)onto.toObject(abs.getAbsObject(TaxonomyOntology.STRUCTURE_TERM));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising Structure");
     }
   }

}
