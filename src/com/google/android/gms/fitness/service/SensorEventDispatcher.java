package com.google.android.gms.fitness.service;

import com.google.android.gms.fitness.data.DataPoint;
import java.util.List;

public abstract interface SensorEventDispatcher
{
  public abstract void publish(DataPoint paramDataPoint);
  
  public abstract void publish(List paramList);
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.service.SensorEventDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */