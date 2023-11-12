/*
* Click 
nbfs://nbhost/SystemFileSystem/Templates/Licenses/licensedefault.txt to change this license
* Click 
nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEj
bClass.java to edit this template
*/
package tracker.ejb;
import jakarta.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;
/**
*
* @author A S U S
*/
@Stateful
public class TrackerBean implements TrackerBeanLocal {
 private double total = 0;
 private int count = 0;
 private final List<Double> oddValuesList = new 
ArrayList<>();
 private final List<Double> evenValuesList = new 
ArrayList<>();
 
 @Override
 public double add(double value) {
 total += value;
 count += 1;
 
 if (value % 2 != 0) {
 oddValuesList.add(value);
 } else {
 evenValuesList.add(value);
 }
 
 return total;
 }
 @Override
 public double average() {
 return total / count;
 }
 @Override
 public int getCount() {
 return count;
 }
 @Override
 public double getTotal() {
 return total;
 }
 @Override
 public .jav[] getOddValues() {
 return convertListToArray(oddValuesList);
 }
 @Override
 public double[] getEvenValues() {
 return convertListToArray(evenValuesList);
 }
 private double[] convertListToArray(List<Double> 
valuesList) {
 double[] valuesArray = new double[valuesList.size()];
 for (int i = 0; i < valuesList.size(); i++) {
 valuesArray[i] = valuesList.get(i);
 }
 return valuesArray;
 }
}
