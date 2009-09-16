package ontology.common.impl;

import java.io.Serializable;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

import ontology.common.*;

/**
* Protege name: Owns
* @author ontology bean generator
* @version 2009/09/15, 18:06:25
*/
public class DefaultOwns implements Owns, Serializable {
   // bean stuff
   protected PropertyChangeSupport pcs = new PropertyChangeSupport(this);

   public void addPropertyChangeListener(PropertyChangeListener pcl) {
     pcs.addPropertyChangeListener(pcl);
   }

   public void removePropertyChangeListener(PropertyChangeListener pcl) {
     pcs.removePropertyChangeListener(pcl);
   }


  private static final long serialVersionUID = -2693500281773954763L;

  private String _internalInstanceName = null;

  public DefaultOwns() {
    this._internalInstanceName = "";
  }

  public DefaultOwns(String instance_name) {
    this._internalInstanceName = instance_name;
  }

  public String toString() {
    return _internalInstanceName;
  }

}
