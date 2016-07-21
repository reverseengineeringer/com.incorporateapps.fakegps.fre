package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zza;

public class zzp
  extends zza
{
  public zzp(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  protected void zzd(Bundle paramBundle, String paramString)
  {
    paramBundle.putString(getName(), paramString);
  }
  
  protected String zzi(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    return paramDataHolder.zzd(getName(), paramInt1, paramInt2);
  }
  
  protected String zzu(Bundle paramBundle)
  {
    return paramBundle.getString(getName());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.zzp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */