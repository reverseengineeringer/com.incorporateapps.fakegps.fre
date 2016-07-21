package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class zza
  implements MetadataField
{
  private final String zzasF;
  private final Set zzasG;
  private final Set zzasH;
  private final int zzasI;
  
  protected zza(String paramString, int paramInt)
  {
    zzasF = ((String)zzx.zzb(paramString, "fieldName"));
    zzasG = Collections.singleton(paramString);
    zzasH = Collections.emptySet();
    zzasI = paramInt;
  }
  
  protected zza(String paramString, Collection paramCollection1, Collection paramCollection2, int paramInt)
  {
    zzasF = ((String)zzx.zzb(paramString, "fieldName"));
    zzasG = Collections.unmodifiableSet(new HashSet(paramCollection1));
    zzasH = Collections.unmodifiableSet(new HashSet(paramCollection2));
    zzasI = paramInt;
  }
  
  public final String getName()
  {
    return zzasF;
  }
  
  public String toString()
  {
    return zzasF;
  }
  
  public final Object zza(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    if (zzb(paramDataHolder, paramInt1, paramInt2)) {
      return zzc(paramDataHolder, paramInt1, paramInt2);
    }
    return null;
  }
  
  protected abstract void zza(Bundle paramBundle, Object paramObject);
  
  public final void zza(DataHolder paramDataHolder, MetadataBundle paramMetadataBundle, int paramInt1, int paramInt2)
  {
    zzx.zzb(paramDataHolder, "dataHolder");
    zzx.zzb(paramMetadataBundle, "bundle");
    if (zzb(paramDataHolder, paramInt1, paramInt2)) {
      paramMetadataBundle.zzc(this, zzc(paramDataHolder, paramInt1, paramInt2));
    }
  }
  
  public final void zza(Object paramObject, Bundle paramBundle)
  {
    zzx.zzb(paramBundle, "bundle");
    if (paramObject == null)
    {
      paramBundle.putString(getName(), null);
      return;
    }
    zza(paramBundle, paramObject);
  }
  
  protected boolean zzb(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    Iterator localIterator = zzasG.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((!paramDataHolder.zzcz(str)) || (paramDataHolder.zzi(str, paramInt1, paramInt2))) {
        return false;
      }
    }
    return true;
  }
  
  protected abstract Object zzc(DataHolder paramDataHolder, int paramInt1, int paramInt2);
  
  public final Object zzm(Bundle paramBundle)
  {
    zzx.zzb(paramBundle, "bundle");
    if (paramBundle.get(getName()) != null) {
      return zzn(paramBundle);
    }
    return null;
  }
  
  protected abstract Object zzn(Bundle paramBundle);
  
  public final Collection zzty()
  {
    return zzasG;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */