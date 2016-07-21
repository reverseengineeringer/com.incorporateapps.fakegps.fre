package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Date;

public class zzd
  extends com.google.android.gms.drive.metadata.zzd
{
  public zzd(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  protected void zza(Bundle paramBundle, Date paramDate)
  {
    paramBundle.putLong(getName(), paramDate.getTime());
  }
  
  protected Date zzf(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    return new Date(paramDataHolder.zzb(getName(), paramInt1, paramInt2));
  }
  
  protected Date zzp(Bundle paramBundle)
  {
    return new Date(paramBundle.getLong(getName()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */