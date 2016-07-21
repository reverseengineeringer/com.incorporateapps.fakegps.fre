package com.google.android.gms.drive.metadata;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;

public abstract class zzb
  extends zza
{
  protected zzb(String paramString, Collection paramCollection1, Collection paramCollection2, int paramInt)
  {
    super(paramString, paramCollection1, paramCollection2, paramInt);
  }
  
  protected Collection zzd(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    throw new UnsupportedOperationException("Cannot read collections from a dataHolder.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */