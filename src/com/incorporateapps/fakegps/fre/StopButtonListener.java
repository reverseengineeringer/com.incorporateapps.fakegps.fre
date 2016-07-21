package com.incorporateapps.fakegps.fre;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class StopButtonListener
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext.stopService(new Intent(paramContext, MockGPSService.class));
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.StopButtonListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */