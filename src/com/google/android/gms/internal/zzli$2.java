package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.cast.internal.zzo;
import org.json.JSONObject;

class zzli$2
  extends zzli.zza
{
  zzli$2(zzli paramzzli, int paramInt, String paramString, JSONObject paramJSONObject)
  {
    super(paramzzli);
  }
  
  public void execute()
  {
    int i = zzll.zzbh(zzacP);
    if (i == 0)
    {
      zznW().zza(-1L, 2001, null);
      zzli.zznV().zzf("sendPlayerRequest for unsupported playerState: %d", new Object[] { Integer.valueOf(zzacP) });
      return;
    }
    zzli.zza(zzacN, zzacQ, i, zzacR, zznW());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzli.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */