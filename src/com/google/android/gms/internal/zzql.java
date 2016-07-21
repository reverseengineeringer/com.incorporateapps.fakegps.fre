package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener;
import com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback;
import com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener;
import com.google.android.gms.nearby.connection.Connections.MessageListener;
import java.util.List;

public final class zzql
  implements Connections
{
  public static final Api.zzc zzUI = new Api.zzc();
  public static final Api.zza zzUJ = new zzql.1();
  
  public static zzqk zzd(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    if (paramGoogleApiClient != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "GoogleApiClient parameter is required.");
      zzx.zza(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      return zze(paramGoogleApiClient, paramBoolean);
    }
  }
  
  public static zzqk zze(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    zzx.zza(paramGoogleApiClient.zza(Nearby.CONNECTIONS_API), "GoogleApiClient is not configured to use the Nearby Connections Api. Pass Nearby.CONNECTIONS_API into GoogleApiClient.Builder#addApi() to use this feature.");
    boolean bool = paramGoogleApiClient.hasConnectedApi(Nearby.CONNECTIONS_API);
    if ((paramBoolean) && (!bool)) {
      throw new IllegalStateException("GoogleApiClient has an optional Nearby.CONNECTIONS_API and is not connected to Nearby Connections. Use GoogleApiClient.hasConnectedApi(Nearby.CONNECTIONS_API) to guard this call.");
    }
    if (bool) {
      return (zzqk)paramGoogleApiClient.zza(zzUI);
    }
    return null;
  }
  
  public final PendingResult acceptConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, Connections.MessageListener paramMessageListener)
  {
    return paramGoogleApiClient.zzb(new zzql.5(this, paramGoogleApiClient, paramString, paramArrayOfByte, paramGoogleApiClient.zzr(paramMessageListener)));
  }
  
  public final void disconnectFromEndpoint(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzd(paramGoogleApiClient, false).zzfA(paramString);
  }
  
  public final String getLocalDeviceId(GoogleApiClient paramGoogleApiClient)
  {
    return zzd(paramGoogleApiClient, true).zzEk();
  }
  
  public final String getLocalEndpointId(GoogleApiClient paramGoogleApiClient)
  {
    return zzd(paramGoogleApiClient, true).zzEj();
  }
  
  public final PendingResult rejectConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.zzb(new zzql.6(this, paramGoogleApiClient, paramString));
  }
  
  public final PendingResult sendConnectionRequest(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, byte[] paramArrayOfByte, Connections.ConnectionResponseCallback paramConnectionResponseCallback, Connections.MessageListener paramMessageListener)
  {
    return paramGoogleApiClient.zzb(new zzql.4(this, paramGoogleApiClient, paramString1, paramString2, paramArrayOfByte, paramGoogleApiClient.zzr(paramConnectionResponseCallback), paramGoogleApiClient.zzr(paramMessageListener)));
  }
  
  public final void sendReliableMessage(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte)
  {
    zzd(paramGoogleApiClient, false).zza(new String[] { paramString }, paramArrayOfByte);
  }
  
  public final void sendReliableMessage(GoogleApiClient paramGoogleApiClient, List paramList, byte[] paramArrayOfByte)
  {
    zzd(paramGoogleApiClient, false).zza((String[])paramList.toArray(new String[paramList.size()]), paramArrayOfByte);
  }
  
  public final void sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte)
  {
    zzd(paramGoogleApiClient, false).zzb(new String[] { paramString }, paramArrayOfByte);
  }
  
  public final void sendUnreliableMessage(GoogleApiClient paramGoogleApiClient, List paramList, byte[] paramArrayOfByte)
  {
    zzd(paramGoogleApiClient, false).zzb((String[])paramList.toArray(new String[paramList.size()]), paramArrayOfByte);
  }
  
  public final PendingResult startAdvertising(GoogleApiClient paramGoogleApiClient, String paramString, AppMetadata paramAppMetadata, long paramLong, Connections.ConnectionRequestListener paramConnectionRequestListener)
  {
    return paramGoogleApiClient.zzb(new zzql.2(this, paramGoogleApiClient, paramString, paramAppMetadata, paramLong, paramGoogleApiClient.zzr(paramConnectionRequestListener)));
  }
  
  public final PendingResult startDiscovery(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong, Connections.EndpointDiscoveryListener paramEndpointDiscoveryListener)
  {
    return paramGoogleApiClient.zzb(new zzql.3(this, paramGoogleApiClient, paramString, paramLong, paramGoogleApiClient.zzr(paramEndpointDiscoveryListener)));
  }
  
  public final void stopAdvertising(GoogleApiClient paramGoogleApiClient)
  {
    zzd(paramGoogleApiClient, false).zzEl();
  }
  
  public final void stopAllEndpoints(GoogleApiClient paramGoogleApiClient)
  {
    zzd(paramGoogleApiClient, false).zzEm();
  }
  
  public final void stopDiscovery(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzd(paramGoogleApiClient, false).zzfz(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzql
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */