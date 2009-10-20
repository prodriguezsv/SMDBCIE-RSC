package ontology.CBR;


import jade.content.abs.*;
import jade.content.onto.*;

/**
* Protege name: IsRootTaxon
* @author ontology bean generator
* @version 2009/10/20, 12:01:13
*/
public interface IsRootTaxon extends jade.content.Predicate, Introspectable {

   /**
   * Protege name: taxon
   */
   public void setTaxon(Taxon value);
   public Taxon getTaxon();

}
