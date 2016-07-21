package com.google.android.gms.plus.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public class zze
  extends zzj
{
  private Person zzbei;
  private final PlusSession zzbej;
  
  public zze(Context paramContext, Looper paramLooper, zzf paramzzf, PlusSession paramPlusSession, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 2, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    zzbej = paramPlusSession;
  }
  
  public static boolean zzd(Set paramSet)
  {
    if ((paramSet == null) || (paramSet.isEmpty())) {}
    while ((paramSet.size() == 1) && (paramSet.contains(new Scope("plus_one_placeholder_scope")))) {
      return false;
    }
    return true;
  }
  
  public String getAccountName()
  {
    zzqI();
    try
    {
      String str = ((zzd)zzqJ()).getAccountName();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public void zzEY()
  {
    zzqI();
    try
    {
      zzbei = null;
      ((zzd)zzqJ()).zzEY();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  public Person zzFa()
  {
    zzqI();
    return zzbei;
  }
  
  public zzq zza(zza.zzb paramzzb, int paramInt, String paramString)
  {
    zzqI();
    paramzzb = new zze.zze(paramzzb);
    try
    {
      paramString = ((zzd)zzqJ()).zza(paramzzb, 1, paramInt, -1, paramString);
      return paramString;
    }
    catch (RemoteException paramString)
    {
      paramzzb.zza(DataHolder.zzbI(8), null);
    }
    return null;
  }
  
  protected void zza(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramBundle != null) && (paramBundle.containsKey("loaded_person"))) {
      zzbei = PersonEntity.zzv(paramBundle.getByteArray("loaded_person"));
    }
    super.zza(paramInt1, paramIBinder, paramBundle, paramInt2);
  }
  
  public void zza(zza.zzb paramzzb, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    zzqI();
    if (paramzzb != null) {}
    for (paramzzb = new zze.zzd(paramzzb);; paramzzb = null) {
      try
      {
        ((zzd)zzqJ()).zza(paramzzb, paramInt, paramString1, paramUri, paramString2, paramString3);
        return;
      }
      catch (RemoteException paramString1)
      {
        paramzzb.zza(DataHolder.zzbI(8), null, null);
      }
    }
  }
  
  public void zza(zza.zzb paramzzb, Moment paramMoment)
  {
    zzqI();
    if (paramzzb != null) {}
    for (paramzzb = new zze.zzc(paramzzb);; paramzzb = null) {
      try
      {
        paramMoment = SafeParcelResponse.zza((MomentEntity)paramMoment);
        ((zzd)zzqJ()).zza(paramzzb, paramMoment);
        return;
      }
      catch (RemoteException paramMoment)
      {
        if (paramzzb != null) {
          break;
        }
        throw new IllegalStateException(paramMoment);
        paramzzb.zzbe(new Status(8, null, null));
      }
    }
  }
  
  public void zza(zza.zzb paramzzb, Collection paramCollection)
  {
    zzqI();
    paramzzb = new zze.zze(paramzzb);
    try
    {
      ((zzd)zzqJ()).zza(paramzzb, new ArrayList(paramCollection));
      return;
    }
    catch (RemoteException paramCollection)
    {
      paramzzb.zza(DataHolder.zzbI(8), null);
    }
  }
  
  public void zzd(zza.zzb paramzzb, String[] paramArrayOfString)
  {
    zza(paramzzb, Arrays.asList(paramArrayOfString));
  }
  
  protected zzd zzdS(IBinder paramIBinder)
  {
    return zzd.zza.zzdR(paramIBinder);
  }
  
  public void zzfG(String paramString)
  {
    zzqI();
    try
    {
      ((zzd)zzqJ()).zzfG(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      throw new IllegalStateException(paramString);
    }
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.plus.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.plus.internal.IPlusService";
  }
  
  public boolean zzmE()
  {
    return zzd(zzqH().zzb(Plus.API));
  }
  
  protected Bundle zzml()
  {
    Bundle localBundle = zzbej.zzFk();
    localBundle.putStringArray("request_visible_actions", zzbej.zzFe());
    localBundle.putString("auth_package", zzbej.zzFg());
    return localBundle;
  }
  
  public void zzo(zza.zzb paramzzb)
  {
    zza(paramzzb, 20, null, null, null, "me");
  }
  
  public void zzp(zza.zzb paramzzb)
  {
    zzqI();
    paramzzb = new zze.zze(paramzzb);
    try
    {
      ((zzd)zzqJ()).zza(paramzzb, 2, 1, -1, null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      paramzzb.zza(DataHolder.zzbI(8), null);
    }
  }
  
  public zzq zzq(zza.zzb paramzzb, String paramString)
  {
    return zza(paramzzb, 0, paramString);
  }
  
  public void zzq(zza.zzb paramzzb)
  {
    zzqI();
    zzEY();
    paramzzb = new zze.zzf(paramzzb);
    try
    {
      ((zzd)zzqJ()).zzb(paramzzb);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      paramzzb.zzi(8, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.plus.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */