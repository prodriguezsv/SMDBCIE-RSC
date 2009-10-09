package ontology.CBR.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.CBR.*;

/**
* Protege name: IsPredecessorTaxonOf
* @author ontology bean generator
* @version 2009/10/7, 18:01:56
*/
public class DefaultIsPredecessorTaxonOf implements IsPredecessorTaxonOf, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = -192457562360579226L;

  private String _internalInstanceName = null;

  public DefaultIsPredecessorTaxonOf() {
    this._internalInstanceName = "";
  }

  public DefaultIsPredecessorTaxonOf(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: subjectTaxon
   */
   private Taxon subjectTaxon;
   public void setSubjectTaxon(Taxon value) { 
     pcs.firePropertyChange("subjectTaxon", (this.subjectTaxon==null?new Taxon():this.subjectTaxon), value);
    this.subjectTaxon=value;
   }
   public Taxon getSubjectTaxon() {
     return this.subjectTaxon;
   }

   /**
   * Protege name: objectTaxon
   */
   private Taxon objectTaxon;
   public void setObjectTaxon(Taxon value) { 
     pcs.firePropertyChange("objectTaxon", (this.objectTaxon==null?new Taxon():this.objectTaxon), value);
    this.objectTaxon=value;
   }
   public Taxon getObjectTaxon() {
     return this.objectTaxon;
   }

}
