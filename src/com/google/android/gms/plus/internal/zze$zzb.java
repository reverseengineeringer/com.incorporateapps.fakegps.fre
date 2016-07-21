package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.model.people.PersonBuffer;

final class zze$zzb
  implements People.LoadPeopleResult
{
  private final Status zzUX;
  private final String zzbek;
  private final PersonBuffer zzben;
  
  public zze$zzb(Status paramStatus, DataHolder paramDataHolder, String paramString)
  {
    zzUX = paramStatus;
    zzbek = paramString;
    if (paramDataHolder != null) {}
    for (paramStatus = new PersonBuffer(paramDataHolder);; paramStatus = null)
    {
      zzben = paramStatus;
      return;
    }
  }
  
  public final String getNextPageToken()
  {
    return zzbek;
  }
  
  public final PersonBuffer getPersonBuffer()
  {
    return zzben;
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
  
  public final void release()
  {
    if (zzben != null) {
      zzben.release();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.zze.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */