package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.zzb;
import java.util.ArrayList;
import java.util.Collection;

public class zzj
  extends zzb
{
  public zzj(String paramString, Collection paramCollection1, Collection paramCollection2, int paramInt)
  {
    super(paramString, paramCollection1, paramCollection2, paramInt);
  }
  
  protected void zza(Bundle paramBundle, Collection paramCollection)
  {
    String str = getName();
    if ((paramCollection instanceof ArrayList)) {}
    for (paramCollection = (ArrayList)paramCollection;; paramCollection = new ArrayList(paramCollection))
    {
      paramBundle.putParcelableArrayList(str, paramCollection);
      return;
    }
  }
  
  protected Collection zzs(Bundle paramBundle)
  {
    return paramBundle.getParcelableArrayList(getName());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.zzj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */