/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
import Business.VitalSignHistory;
import Business.VitalSigns;
import java.awt.List;

/**
 *
 * @author Sheetal Sekhar
 */
public class VitalSignHistory {
    private ArrayList<VitalSigns> vitalSignHistory;
    
    public VitalSignHistory()
    {
        vitalSignHistory= new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSigns addVitals()
    {
        VitalSigns vs;
        vs= new VitalSigns();
    vitalSignHistory.add(vs);
    return vs;
}
    
    
    public void deleteVitals(VitalSigns v)
    {
    vitalSignHistory.remove(v);
    }
    
    public ArrayList<VitalSigns> getAbnormalList(double maxbp, double minbp)
    {
       
    ArrayList<VitalSigns> abnList = new ArrayList<>();
    
    for (VitalSigns vs: vitalSignHistory)
    {
    if (vs.getBloodPresuure()>maxbp || vs.getBloodPresuure()<minbp)
    {
    abnList.add(vs);
    }
    }
    return abnList;
    }
    
    }

