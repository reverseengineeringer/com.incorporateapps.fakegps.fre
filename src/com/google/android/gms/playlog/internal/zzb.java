package com.google.android.gms.playlog.internal;

import java.util.ArrayList;

public class zzb
{
  private final ArrayList zzbdE = new ArrayList();
  private int zzbdF;
  
  public zzb()
  {
    this(100);
  }
  
  public zzb(int paramInt)
  {
    zzbdF = paramInt;
  }
  
  private void zzEV()
  {
    while (getSize() > getCapacity()) {
      zzbdE.remove(0);
    }
  }
  
  public void clear()
  {
    zzbdE.clear();
  }
  
  public int getCapacity()
  {
    return zzbdF;
  }
  
  public int getSize()
  {
    return zzbdE.size();
  }
  
  public boolean isEmpty()
  {
    return zzbdE.isEmpty();
  }
  
  public ArrayList zzEU()
  {
    return zzbdE;
  }
  
  public void zza(PlayLoggerContext paramPlayLoggerContext, LogEvent paramLogEvent)
  {
    zzbdE.add(new zzb.zza(paramPlayLoggerContext, paramLogEvent, null));
    zzEV();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.playlog.internal.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */