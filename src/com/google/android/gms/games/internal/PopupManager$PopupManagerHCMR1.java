package com.google.android.gms.games.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import com.google.android.gms.internal.zzne;
import java.lang.ref.WeakReference;

final class PopupManager$PopupManagerHCMR1
  extends PopupManager
  implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener
{
  private boolean zzaEe = false;
  private WeakReference zzaFN;
  
  protected PopupManager$PopupManagerHCMR1(GamesClientImpl paramGamesClientImpl, int paramInt)
  {
    super(paramGamesClientImpl, paramInt, null);
  }
  
  private void zzq(View paramView)
  {
    int j = -1;
    int i = j;
    if (zzne.zzsi())
    {
      localObject = paramView.getDisplay();
      i = j;
      if (localObject != null) {
        i = ((Display)localObject).getDisplayId();
      }
    }
    Object localObject = paramView.getWindowToken();
    int[] arrayOfInt = new int[2];
    paramView.getLocationInWindow(arrayOfInt);
    j = paramView.getWidth();
    int k = paramView.getHeight();
    zzaFK.zzaFM = i;
    zzaFK.zzaFL = ((IBinder)localObject);
    zzaFK.left = arrayOfInt[0];
    zzaFK.top = arrayOfInt[1];
    zzaFK.right = (arrayOfInt[0] + j);
    zzaFK.bottom = (arrayOfInt[1] + k);
    if (zzaEe)
    {
      zzxh();
      zzaEe = false;
    }
  }
  
  public final void onGlobalLayout()
  {
    if (zzaFN == null) {}
    View localView;
    do
    {
      return;
      localView = (View)zzaFN.get();
    } while (localView == null);
    zzq(localView);
  }
  
  public final void onViewAttachedToWindow(View paramView)
  {
    zzq(paramView);
  }
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    zzaFJ.zzwR();
    paramView.removeOnAttachStateChangeListener(this);
  }
  
  protected final void zzgv(int paramInt)
  {
    zzaFK = new PopupManager.PopupLocationInfo(paramInt, null, null);
  }
  
  public final void zzp(View paramView)
  {
    zzaFJ.zzwR();
    Object localObject2;
    Object localObject1;
    if (zzaFN != null)
    {
      localObject2 = (View)zzaFN.get();
      Context localContext = zzaFJ.getContext();
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = localObject2;
        if ((localContext instanceof Activity)) {
          localObject1 = ((Activity)localContext).getWindow().getDecorView();
        }
      }
      if (localObject1 != null)
      {
        ((View)localObject1).removeOnAttachStateChangeListener(this);
        localObject1 = ((View)localObject1).getViewTreeObserver();
        if (!zzne.zzsh()) {
          break label186;
        }
        ((ViewTreeObserver)localObject1).removeOnGlobalLayoutListener(this);
      }
    }
    for (;;)
    {
      zzaFN = null;
      localObject2 = zzaFJ.getContext();
      localObject1 = paramView;
      if (paramView == null)
      {
        localObject1 = paramView;
        if ((localObject2 instanceof Activity))
        {
          localObject1 = ((Activity)localObject2).findViewById(16908290);
          paramView = (View)localObject1;
          if (localObject1 == null) {
            paramView = ((Activity)localObject2).getWindow().getDecorView();
          }
          GamesLog.zzz("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
          localObject1 = paramView;
        }
      }
      if (localObject1 == null) {
        break;
      }
      zzq((View)localObject1);
      zzaFN = new WeakReference(localObject1);
      ((View)localObject1).addOnAttachStateChangeListener(this);
      ((View)localObject1).getViewTreeObserver().addOnGlobalLayoutListener(this);
      return;
      label186:
      ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener(this);
    }
    GamesLog.zzA("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
  }
  
  public final void zzxh()
  {
    if (zzaFK.zzaFL != null)
    {
      super.zzxh();
      return;
    }
    if (zzaFN != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzaEe = bool;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.PopupManager.PopupManagerHCMR1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */