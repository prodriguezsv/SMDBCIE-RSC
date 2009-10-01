package ontology.taxonomy;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;


/**
* Protege name: IsSuccessorTaxonOf
* @author ontology bean generator
* @version 2009/09/30, 13:34:31
*/
public interface IsSuccessorTaxonOf extends jade.content.Predicate, Serializable {
   // bean stuff
   public void addPropertyChangeListener(PropertyChangeListener pcl);
   public void removePropertyChangeListener(PropertyChangeListener pcl);

   /**
   * Protege name: subjectTaxon
   */
   public void setSubjectTaxon(Taxon value);
   public Taxon getSubjectTaxon();

   /**
   * Protege name: objectTaxon
   */
   public void setObjectTaxon(Taxon value);
   public Taxon getObjectTaxon();

}
