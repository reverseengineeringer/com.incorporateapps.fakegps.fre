package com.google.android.gms.vision;

import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MultiProcessor
  implements Detector.Processor
{
  private int zzbne = 3;
  private MultiProcessor.Factory zzbnq;
  private SparseArray zzbnr = new SparseArray();
  
  private void zza(Detector.Detections paramDetections)
  {
    paramDetections = paramDetections.getDetectedItems();
    int i = 0;
    while (i < paramDetections.size())
    {
      int j = paramDetections.keyAt(i);
      Object localObject = paramDetections.valueAt(i);
      if (zzbnr.get(j) == null)
      {
        MultiProcessor.zza localzza = new MultiProcessor.zza(this, null);
        MultiProcessor.zza.zza(localzza, zzbnq.create(localObject));
        MultiProcessor.zza.zza(localzza).onNewItem(j, localObject);
        zzbnr.append(j, localzza);
      }
      i += 1;
    }
  }
  
  private void zzb(Detector.Detections paramDetections)
  {
    Object localObject = paramDetections.getDetectedItems();
    HashSet localHashSet = new HashSet();
    int i = 0;
    if (i < zzbnr.size())
    {
      int j = zzbnr.keyAt(i);
      MultiProcessor.zza localzza;
      if (((SparseArray)localObject).get(j) == null)
      {
        localzza = (MultiProcessor.zza)zzbnr.valueAt(i);
        MultiProcessor.zza.zzb(localzza);
        if (MultiProcessor.zza.zzc(localzza) < zzbne) {
          break label104;
        }
        MultiProcessor.zza.zza(localzza).onDone();
        localHashSet.add(Integer.valueOf(j));
      }
      for (;;)
      {
        i += 1;
        break;
        label104:
        MultiProcessor.zza.zza(localzza).onMissing(paramDetections);
      }
    }
    paramDetections = localHashSet.iterator();
    while (paramDetections.hasNext())
    {
      localObject = (Integer)paramDetections.next();
      zzbnr.delete(((Integer)localObject).intValue());
    }
  }
  
  private void zzc(Detector.Detections paramDetections)
  {
    SparseArray localSparseArray = paramDetections.getDetectedItems();
    int i = 0;
    while (i < localSparseArray.size())
    {
      int j = localSparseArray.keyAt(i);
      Object localObject = localSparseArray.valueAt(i);
      MultiProcessor.zza localzza = (MultiProcessor.zza)zzbnr.get(j);
      MultiProcessor.zza.zza(localzza, 0);
      MultiProcessor.zza.zza(localzza).onUpdate(paramDetections, localObject);
      i += 1;
    }
  }
  
  public void receiveDetections(Detector.Detections paramDetections)
  {
    zza(paramDetections);
    zzb(paramDetections);
    zzc(paramDetections);
  }
  
  public void release()
  {
    int i = 0;
    while (i < zzbnr.size())
    {
      MultiProcessor.zza.zza((MultiProcessor.zza)zzbnr.valueAt(i)).onDone();
      i += 1;
    }
    zzbnr.clear();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.MultiProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */