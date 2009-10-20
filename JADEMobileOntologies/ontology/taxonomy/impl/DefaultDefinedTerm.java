package ontology.taxonomy.impl;


import jade.content.abs.*;
import jade.content.onto.*;
import ontology.taxonomy.*;

/**
* Define the terms utilized in the taxonomic  hierarchy
* Protege name: DefinedTerm
* @author ontology bean generator
* @version 2009/10/20, 16:33:54
*/
public class DefaultDefinedTerm implements DefinedTerm, Introspectable {

  private static final long serialVersionUID = 8335714681696847814L;

  private String _internalInstanceName = null;

  public DefaultDefinedTerm() {
    this._internalInstanceName = "";
  }

  public DefaultDefinedTerm(String instance_name) {
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

  public void externalise(AbsObject absObj, Ontology onto) throws OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      abs.set(TaxonomyOntology.DEFINEDTERM_DEFINITION, (AbsTerm) onto.fromObject(getDefinition()));
      abs.set(TaxonomyOntology.DEFINEDTERM_TERM, (AbsTerm) onto.fromObject(getTerm()));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error externalising DefinedTerm");
     }
   }

  public void internalise(AbsObject absObj, Ontology onto) throws UngroundedException, OntologyException {
    try {
      AbsConcept abs = (AbsConcept) absObj;
      definition = (String)onto.toObject(abs.getAbsObject(TaxonomyOntology.DEFINEDTERM_DEFINITION));
      term = (String)onto.toObject(abs.getAbsObject(TaxonomyOntology.DEFINEDTERM_TERM));
     } catch (ClassCastException cce) {
       throw new OntologyException("Error internalising DefinedTerm");
     }
   }

}
