package ontology.taxonomy.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import jade.util.leap.*;
import ontology.taxonomy.*;

/**
* Protege name: Description
* @author ontology bean generator
* @version 2009/09/30, 13:34:31
*/
public class DefaultDescription implements Description, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = -8627856865395943317L;

  private String _internalInstanceName = null;

  public DefaultDescription() {
    this._internalInstanceName = "";
  }

  public DefaultDescription(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

   /**
   * Protege name: descriptors
   */
   private List descriptors = new ArrayList();
   public void addDescriptors(Descriptor elem) { 
     descriptors.add(elem);
     pcs.firePropertyChange("descriptors", oldList, this.descriptors);
   }
   public boolean removeDescriptors(Descriptor elem) {
     boolean result = descriptors.remove(elem);
     pcs.firePropertyChange("descriptors", oldList, this.descriptors);
     return result;
   }
   public void clearAllDescriptors() {
     descriptors.clear();
     pcs.firePropertyChange("descriptors", oldList, this.descriptors);
   }
   public Iterator getAllDescriptors() {return descriptors.iterator(); }
   public List getDescriptors() {return descriptors; }
   public void setDescriptors(List l) {descriptors = l; }

}
