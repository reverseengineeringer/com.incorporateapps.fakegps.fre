package com.google.android.gms.measurement.internal;

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzpz.zza;
import com.google.android.gms.internal.zzpz.zzb;
import com.google.android.gms.internal.zzpz.zzc;
import com.google.android.gms.internal.zzpz.zzd;
import com.google.android.gms.internal.zzpz.zze;
import com.google.android.gms.internal.zzqb.zza;
import com.google.android.gms.internal.zzqb.zzb;
import com.google.android.gms.internal.zzqb.zzc;
import com.google.android.gms.internal.zzqb.zzf;
import com.google.android.gms.internal.zzqb.zzg;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

class zzc
  extends zzz
{
  zzc(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  private Boolean zza(zzpz.zzb paramzzb, zzqb.zzb paramzzb1, long paramLong)
  {
    if (zzaZz != null)
    {
      localObject1 = new zzs(zzaZz).zzac(paramLong);
      if (localObject1 == null) {
        return null;
      }
      if (!((Boolean)localObject1).booleanValue()) {
        return Boolean.valueOf(false);
      }
    }
    Object localObject2 = new HashSet();
    Object localObject1 = zzaZx;
    int j = localObject1.length;
    int i = 0;
    while (i < j)
    {
      localObject3 = localObject1[i];
      if (TextUtils.isEmpty(zzaZE))
      {
        zzAo().zzCF().zzj("null or empty param name in filter. event", name);
        return null;
      }
      ((Set)localObject2).add(zzaZE);
      i += 1;
    }
    localObject1 = new ArrayMap();
    Object localObject3 = zzbae;
    j = localObject3.length;
    i = 0;
    Object localObject4;
    if (i < j)
    {
      localObject4 = localObject3[i];
      if (((Set)localObject2).contains(name))
      {
        if (zzbai == null) {
          break label219;
        }
        ((Map)localObject1).put(name, zzbai);
      }
      for (;;)
      {
        i += 1;
        break;
        label219:
        if (zzaZo != null)
        {
          ((Map)localObject1).put(name, zzaZo);
        }
        else
        {
          if (zzamJ == null) {
            break label277;
          }
          ((Map)localObject1).put(name, zzamJ);
        }
      }
      label277:
      zzAo().zzCF().zze("Unknown value for param. event, param", name, name);
      return null;
    }
    paramzzb = zzaZx;
    j = paramzzb.length;
    i = 0;
    while (i < j)
    {
      localObject2 = paramzzb[i];
      localObject3 = zzaZE;
      if (TextUtils.isEmpty((CharSequence)localObject3))
      {
        zzAo().zzCF().zzj("Event has empty param name. event", name);
        return null;
      }
      localObject4 = ((Map)localObject1).get(localObject3);
      if ((localObject4 instanceof Long))
      {
        if (zzaZC == null)
        {
          zzAo().zzCF().zze("No number filter for long param. event, param", name, localObject3);
          return null;
        }
        localObject2 = new zzs(zzaZC).zzac(((Long)localObject4).longValue());
        if (localObject2 == null) {
          return null;
        }
        if (!((Boolean)localObject2).booleanValue()) {
          return Boolean.valueOf(false);
        }
      }
      else if ((localObject4 instanceof Float))
      {
        if (zzaZC == null)
        {
          zzAo().zzCF().zze("No number filter for float param. event, param", name, localObject3);
          return null;
        }
        localObject2 = new zzs(zzaZC).zzi(((Float)localObject4).floatValue());
        if (localObject2 == null) {
          return null;
        }
        if (!((Boolean)localObject2).booleanValue()) {
          return Boolean.valueOf(false);
        }
      }
      else if ((localObject4 instanceof String))
      {
        if (zzaZB == null)
        {
          zzAo().zzCF().zze("No string filter for String param. event, param", name, localObject3);
          return null;
        }
        localObject2 = new zzae(zzaZB).zzfp((String)localObject4);
        if (localObject2 == null) {
          return null;
        }
        if (!((Boolean)localObject2).booleanValue()) {
          return Boolean.valueOf(false);
        }
      }
      else
      {
        if (localObject4 == null)
        {
          zzAo().zzCK().zze("Missing param for filter. event, param", name, localObject3);
          return Boolean.valueOf(false);
        }
        zzAo().zzCF().zze("Unknown param type. event, param", name, localObject3);
        return null;
      }
      i += 1;
    }
    return Boolean.valueOf(true);
  }
  
  private Boolean zza(zzpz.zze paramzze, zzqb.zzg paramzzg)
  {
    paramzze = zzaZM;
    if (paramzze == null)
    {
      zzAo().zzCF().zzj("Missing property filter. property", name);
      return null;
    }
    if (zzbai != null)
    {
      if (zzaZC == null)
      {
        zzAo().zzCF().zzj("No number filter for long property. property", name);
        return null;
      }
      return new zzs(zzaZC).zzac(zzbai.longValue());
    }
    if (zzaZo != null)
    {
      if (zzaZC == null)
      {
        zzAo().zzCF().zzj("No number filter for float property. property", name);
        return null;
      }
      return new zzs(zzaZC).zzi(zzaZo.floatValue());
    }
    if (zzamJ != null)
    {
      if (zzaZB == null)
      {
        if (zzaZC == null)
        {
          zzAo().zzCF().zzj("No string or number filter defined. property", name);
          return null;
        }
        zzs localzzs = new zzs(zzaZC);
        if (!zzaZC.zzaZG.booleanValue())
        {
          if (zzeQ(zzamJ)) {
            try
            {
              paramzze = localzzs.zzac(Long.parseLong(zzamJ));
              return paramzze;
            }
            catch (NumberFormatException paramzze)
            {
              zzAo().zzCF().zze("User property value exceeded Long value range. property, value", name, zzamJ);
              return null;
            }
          }
          zzAo().zzCF().zze("Invalid user property value for Long number filter. property, value", name, zzamJ);
          return null;
        }
        if (zzeR(zzamJ)) {
          try
          {
            float f = Float.parseFloat(zzamJ);
            if (!Float.isInfinite(f)) {
              return localzzs.zzi(f);
            }
            zzAo().zzCF().zze("User property value exceeded Float value range. property, value", name, zzamJ);
            return null;
          }
          catch (NumberFormatException paramzze)
          {
            zzAo().zzCF().zze("User property value exceeded Float value range. property, value", name, zzamJ);
            return null;
          }
        }
        zzAo().zzCF().zze("Invalid user property value for Float number filter. property, value", name, zzamJ);
        return null;
      }
      return new zzae(zzaZB).zzfp(zzamJ);
    }
    zzAo().zzCF().zzj("User property has no value, property", name);
    return null;
  }
  
  void zza(String paramString, zzpz.zza[] paramArrayOfzza)
  {
    zzCj().zzb(paramString, paramArrayOfzza);
  }
  
  zzqb.zza[] zza(String paramString, zzqb.zzb[] paramArrayOfzzb, zzqb.zzg[] paramArrayOfzzg)
  {
    zzx.zzcM(paramString);
    HashSet localHashSet = new HashSet();
    ArrayMap localArrayMap1 = new ArrayMap();
    ArrayMap localArrayMap2 = new ArrayMap();
    ArrayMap localArrayMap3 = new ArrayMap();
    ArrayMap localArrayMap4;
    int k;
    int i;
    Object localObject5;
    Object localObject1;
    long l;
    Object localObject2;
    if (paramArrayOfzzb != null)
    {
      localArrayMap4 = new ArrayMap();
      k = paramArrayOfzzb.length;
      i = 0;
      if (i < k)
      {
        localObject5 = paramArrayOfzzb[i];
        localObject1 = zzCj().zzI(paramString, name);
        if (localObject1 == null)
        {
          zzAo().zzCF().zzj("Event aggregate wasn't created during raw event logging. event", name);
          localObject1 = new zzi(paramString, name, 1L, 1L, zzbaf.longValue());
          zzCj().zza((zzi)localObject1);
          l = zzaVP;
          localObject1 = (Map)localArrayMap4.get(name);
          if (localObject1 != null) {
            break label1816;
          }
          localObject2 = zzCj().zzL(paramString, name);
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = new ArrayMap();
          }
          localArrayMap4.put(name, localObject1);
        }
      }
    }
    label265:
    label842:
    label991:
    label1259:
    label1586:
    label1801:
    label1804:
    label1807:
    label1813:
    label1816:
    for (;;)
    {
      zzAo().zzCK().zze("Found audiences. event, audience count", name, Integer.valueOf(((Map)localObject1).size()));
      Iterator localIterator = ((Map)localObject1).keySet().iterator();
      int m;
      for (;;)
      {
        if (localIterator.hasNext())
        {
          m = ((Integer)localIterator.next()).intValue();
          if (localHashSet.contains(Integer.valueOf(m)))
          {
            zzAo().zzCK().zzj("Skipping failed audience ID", Integer.valueOf(m));
            continue;
            localObject1 = ((zzi)localObject1).zzCB();
            break;
          }
          localObject2 = (zzqb.zza)localArrayMap1.get(Integer.valueOf(m));
          if (localObject2 != null) {
            break label1813;
          }
          localObject2 = new zzqb.zza();
          localArrayMap1.put(Integer.valueOf(m), localObject2);
          zzbac = Boolean.valueOf(false);
        }
      }
      for (;;)
      {
        Object localObject6 = (List)((Map)localObject1).get(Integer.valueOf(m));
        Object localObject4 = (BitSet)localArrayMap2.get(Integer.valueOf(m));
        Object localObject3 = (BitSet)localArrayMap3.get(Integer.valueOf(m));
        if (localObject4 == null)
        {
          localObject4 = new BitSet();
          localArrayMap2.put(Integer.valueOf(m), localObject4);
          localObject3 = new BitSet();
          localArrayMap3.put(Integer.valueOf(m), localObject3);
        }
        for (;;)
        {
          Object localObject7;
          if ((zzbab == null) && (!zzbac.booleanValue()))
          {
            localObject7 = zzCj().zzC(paramString, m);
            if (localObject7 == null) {
              zzbac = Boolean.valueOf(true);
            }
          }
          else
          {
            localObject2 = ((List)localObject6).iterator();
          }
          int j;
          for (;;)
          {
            if (!((Iterator)localObject2).hasNext()) {
              break label842;
            }
            localObject6 = (zzpz.zzb)((Iterator)localObject2).next();
            if (zzAo().zzQ(2))
            {
              zzAo().zzCK().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(m), zzaZv, zzaZw);
              zzAo().zzCK().zzj("Filter definition", localObject6);
            }
            if (zzaZv.intValue() > 256)
            {
              zzAo().zzCF().zzj("Invalid event filter ID > 256. id", zzaZv);
              continue;
              zzbab = ((zzqb.zzf)localObject7);
              j = 0;
              while (j < zzbaH.length * 64)
              {
                if (zzaj.zza(zzbaH, j))
                {
                  zzAo().zzCK().zze("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(m), Integer.valueOf(j));
                  ((BitSet)localObject4).set(j);
                  ((BitSet)localObject3).set(j);
                }
                j += 1;
              }
              break;
            }
            if (!((BitSet)localObject3).get(zzaZv.intValue()))
            {
              localObject7 = zza((zzpz.zzb)localObject6, (zzqb.zzb)localObject5, l);
              zzAo().zzCK().zzj("Event filter result", localObject7);
              if (localObject7 == null)
              {
                localHashSet.add(Integer.valueOf(m));
              }
              else
              {
                ((BitSet)localObject3).set(zzaZv.intValue());
                if (((Boolean)localObject7).booleanValue()) {
                  ((BitSet)localObject4).set(zzaZv.intValue());
                }
              }
            }
          }
          break label265;
          i += 1;
          break;
          if (paramArrayOfzzg != null)
          {
            localArrayMap4 = new ArrayMap();
            k = paramArrayOfzzg.length;
            i = 0;
            if (i < k)
            {
              localObject5 = paramArrayOfzzg[i];
              paramArrayOfzzb = (Map)localArrayMap4.get(name);
              if (paramArrayOfzzb != null) {
                break label1807;
              }
              localObject1 = zzCj().zzM(paramString, name);
              paramArrayOfzzb = (zzqb.zzb[])localObject1;
              if (localObject1 == null) {
                paramArrayOfzzb = new ArrayMap();
              }
              localArrayMap4.put(name, paramArrayOfzzb);
            }
          }
          for (;;)
          {
            zzAo().zzCK().zze("Found audiences. property, audience count", name, Integer.valueOf(paramArrayOfzzb.size()));
            localIterator = paramArrayOfzzb.keySet().iterator();
            while (localIterator.hasNext())
            {
              m = ((Integer)localIterator.next()).intValue();
              if (localHashSet.contains(Integer.valueOf(m)))
              {
                zzAo().zzCK().zzj("Skipping failed audience ID", Integer.valueOf(m));
              }
              else
              {
                localObject3 = (zzqb.zza)localArrayMap1.get(Integer.valueOf(m));
                if (localObject3 != null) {
                  break label1804;
                }
                localObject3 = new zzqb.zza();
                localArrayMap1.put(Integer.valueOf(m), localObject3);
                zzbac = Boolean.valueOf(false);
              }
            }
            for (;;)
            {
              localObject6 = (List)paramArrayOfzzb.get(Integer.valueOf(m));
              localObject4 = (BitSet)localArrayMap2.get(Integer.valueOf(m));
              localObject2 = (BitSet)localArrayMap3.get(Integer.valueOf(m));
              localObject1 = localObject4;
              if (localObject4 == null)
              {
                localObject1 = new BitSet();
                localArrayMap2.put(Integer.valueOf(m), localObject1);
                localObject2 = new BitSet();
                localArrayMap3.put(Integer.valueOf(m), localObject2);
              }
              if ((zzbab == null) && (!zzbac.booleanValue()))
              {
                localObject4 = zzCj().zzC(paramString, m);
                if (localObject4 == null) {
                  zzbac = Boolean.valueOf(true);
                }
              }
              else
              {
                localObject3 = ((List)localObject6).iterator();
              }
              for (;;)
              {
                if (!((Iterator)localObject3).hasNext()) {
                  break label1586;
                }
                localObject4 = (zzpz.zze)((Iterator)localObject3).next();
                if (zzAo().zzQ(2))
                {
                  zzAo().zzCK().zzd("Evaluating filter. audience, filter, property", Integer.valueOf(m), zzaZv, zzaZL);
                  zzAo().zzCK().zzj("Filter definition", localObject4);
                }
                if ((zzaZv == null) || (zzaZv.intValue() > 256))
                {
                  zzAo().zzCF().zzj("Invalid property filter ID. id", String.valueOf(zzaZv));
                  localHashSet.add(Integer.valueOf(m));
                  break;
                  zzbab = ((zzqb.zzf)localObject4);
                  j = 0;
                  while (j < zzbaH.length * 64)
                  {
                    if (zzaj.zza(zzbaH, j))
                    {
                      ((BitSet)localObject1).set(j);
                      ((BitSet)localObject2).set(j);
                    }
                    j += 1;
                  }
                  break label1259;
                }
                if (((BitSet)localObject2).get(zzaZv.intValue()))
                {
                  zzAo().zzCK().zze("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(m), zzaZv);
                }
                else
                {
                  localObject6 = zza((zzpz.zze)localObject4, (zzqb.zzg)localObject5);
                  zzAo().zzCK().zzj("Property filter result", localObject6);
                  if (localObject6 == null)
                  {
                    localHashSet.add(Integer.valueOf(m));
                  }
                  else
                  {
                    ((BitSet)localObject2).set(zzaZv.intValue());
                    if (((Boolean)localObject6).booleanValue()) {
                      ((BitSet)localObject1).set(zzaZv.intValue());
                    }
                  }
                }
              }
              break label991;
              i += 1;
              break;
              paramArrayOfzzg = new zzqb.zza[localArrayMap2.size()];
              localObject1 = localArrayMap2.keySet().iterator();
              i = 0;
              while (((Iterator)localObject1).hasNext())
              {
                j = ((Integer)((Iterator)localObject1).next()).intValue();
                if (!localHashSet.contains(Integer.valueOf(j)))
                {
                  paramArrayOfzzb = (zzqb.zza)localArrayMap1.get(Integer.valueOf(j));
                  if (paramArrayOfzzb != null) {
                    break label1801;
                  }
                  paramArrayOfzzb = new zzqb.zza();
                }
              }
              for (;;)
              {
                paramArrayOfzzg[i] = paramArrayOfzzb;
                zzaZr = Integer.valueOf(j);
                zzbaa = new zzqb.zzf();
                zzbaa.zzbaH = zzaj.zza((BitSet)localArrayMap2.get(Integer.valueOf(j)));
                zzbaa.zzbaG = zzaj.zza((BitSet)localArrayMap3.get(Integer.valueOf(j)));
                zzCj().zza(paramString, j, zzbaa);
                i += 1;
                break;
                return (zzqb.zza[])Arrays.copyOf(paramArrayOfzzg, i);
              }
            }
          }
        }
      }
    }
  }
  
  boolean zzeQ(String paramString)
  {
    return Pattern.matches("[+-]?[0-9]+", paramString);
  }
  
  boolean zzeR(String paramString)
  {
    return Pattern.matches("[+-]?(([0-9]+\\.?)|([0-9]*\\.[0-9]+))", paramString);
  }
  
  protected void zziJ() {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.internal.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */