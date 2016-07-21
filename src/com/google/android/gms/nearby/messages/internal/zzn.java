package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.PublishOptions.Builder;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import com.google.android.gms.nearby.messages.SubscribeOptions.Builder;
import java.util.Iterator;
import java.util.List;

public class zzn
  implements Messages
{
  public static final Api.zzc zzUI = new Api.zzc();
  public static final Api.zza zzUJ = new zzn.1();
  
  private static Message zzA(Intent paramIntent)
  {
    return (Message)zzj.zzc(paramIntent, "com.google.android.gms.nearby.messages.MESSAGES");
  }
  
  private static Message zzB(Intent paramIntent)
  {
    return (Message)zzj.zzc(paramIntent, "com.google.android.gms.nearby.messages.LOST_MESSAGE");
  }
  
  private static List zzC(Intent paramIntent)
  {
    return zzj.zzd(paramIntent, "com.google.android.gms.nearby.messages.UPDATED_MESSAGES");
  }
  
  public PendingResult getPermissionStatus(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.zzb(new zzn.9(this, paramGoogleApiClient));
  }
  
  public void handleIntent(Intent paramIntent, MessageListener paramMessageListener)
  {
    Message localMessage = zzA(paramIntent);
    if (localMessage != null) {
      paramMessageListener.onFound(localMessage);
    }
    localMessage = zzB(paramIntent);
    if (localMessage != null) {
      paramMessageListener.onLost(localMessage);
    }
    paramIntent = zzC(paramIntent).iterator();
    while (paramIntent.hasNext()) {
      paramMessageListener.zza((Message)paramIntent.next());
    }
  }
  
  public PendingResult publish(GoogleApiClient paramGoogleApiClient, Message paramMessage)
  {
    return publish(paramGoogleApiClient, paramMessage, PublishOptions.DEFAULT);
  }
  
  public PendingResult publish(GoogleApiClient paramGoogleApiClient, Message paramMessage, PublishOptions paramPublishOptions)
  {
    zzx.zzz(paramMessage);
    zzx.zzz(paramPublishOptions);
    return paramGoogleApiClient.zzb(new zzn.3(this, paramGoogleApiClient, paramMessage, paramPublishOptions));
  }
  
  public PendingResult publish(GoogleApiClient paramGoogleApiClient, Message paramMessage, Strategy paramStrategy)
  {
    return publish(paramGoogleApiClient, paramMessage, new PublishOptions.Builder().setStrategy(paramStrategy).build());
  }
  
  public PendingResult registerStatusCallback(GoogleApiClient paramGoogleApiClient, StatusCallback paramStatusCallback)
  {
    zzx.zzz(paramStatusCallback);
    return paramGoogleApiClient.zzb(new zzn.10(this, paramGoogleApiClient, ((zzm)paramGoogleApiClient.zza(zzUI)).zza(paramGoogleApiClient, paramStatusCallback), paramStatusCallback));
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return subscribe(paramGoogleApiClient, paramPendingIntent, SubscribeOptions.DEFAULT);
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent, SubscribeOptions paramSubscribeOptions)
  {
    zzx.zzz(paramPendingIntent);
    zzx.zzz(paramSubscribeOptions);
    return paramGoogleApiClient.zzb(new zzn.6(this, paramGoogleApiClient, paramPendingIntent, paramSubscribeOptions));
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener)
  {
    return subscribe(paramGoogleApiClient, paramMessageListener, SubscribeOptions.DEFAULT);
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener, Strategy paramStrategy)
  {
    return subscribe(paramGoogleApiClient, paramMessageListener, new SubscribeOptions.Builder().setStrategy(paramStrategy).build());
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener, Strategy paramStrategy, MessageFilter paramMessageFilter)
  {
    return subscribe(paramGoogleApiClient, paramMessageListener, new SubscribeOptions.Builder().setStrategy(paramStrategy).setFilter(paramMessageFilter).build());
  }
  
  public PendingResult subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener, SubscribeOptions paramSubscribeOptions)
  {
    zzx.zzz(paramMessageListener);
    zzx.zzz(paramSubscribeOptions);
    return paramGoogleApiClient.zzb(new zzn.5(this, paramGoogleApiClient, ((zzm)paramGoogleApiClient.zza(zzUI)).zza(paramGoogleApiClient, paramMessageListener), paramMessageListener, paramSubscribeOptions));
  }
  
  public PendingResult unpublish(GoogleApiClient paramGoogleApiClient, Message paramMessage)
  {
    zzx.zzz(paramMessage);
    return paramGoogleApiClient.zzb(new zzn.4(this, paramGoogleApiClient, paramMessage));
  }
  
  public PendingResult unregisterStatusCallback(GoogleApiClient paramGoogleApiClient, StatusCallback paramStatusCallback)
  {
    return paramGoogleApiClient.zzb(new zzn.2(this, paramGoogleApiClient, ((zzm)paramGoogleApiClient.zza(zzUI)).zza(paramGoogleApiClient, paramStatusCallback), paramStatusCallback));
  }
  
  public PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    zzx.zzz(paramPendingIntent);
    return paramGoogleApiClient.zzb(new zzn.8(this, paramGoogleApiClient, paramPendingIntent));
  }
  
  public PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener)
  {
    zzx.zzz(paramMessageListener);
    return paramGoogleApiClient.zzb(new zzn.7(this, paramGoogleApiClient, ((zzm)paramGoogleApiClient.zza(zzUI)).zza(paramGoogleApiClient, paramMessageListener), paramMessageListener));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.messages.internal.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */