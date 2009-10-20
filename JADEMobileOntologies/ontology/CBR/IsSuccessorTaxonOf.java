package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: IsSuccessorTaxonOf
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface IsSuccessorTaxonOf extends jade.content.Predicate, Introspectable {

   /**
   * Protege name: objectTaxon
   */
   public void setObjectTaxon(Taxon value);
   public Taxon getObjectTaxon();

   /**
   * Protege name: subjectTaxon
   */
   public void setSubjectTaxon(Taxon value);
   public Taxon getSubjectTaxon();

}
