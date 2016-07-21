package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.internal.client.zzab;

public final class PublisherAdView
  extends ViewGroup
{
  private final zzab zzoJ;
  
  public PublisherAdView(Context paramContext)
  {
    super(paramContext);
    zzoJ = new zzab(this);
  }
  
  public PublisherAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    zzoJ = new zzab(this, paramAttributeSet, true);
  }
  
  public PublisherAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    zzoJ = new zzab(this, paramAttributeSet, true);
  }
  
  public final void destroy()
  {
    zzoJ.destroy();
  }
  
  public final AdListener getAdListener()
  {
    return zzoJ.getAdListener();
  }
  
  public final AdSize getAdSize()
  {
    return zzoJ.getAdSize();
  }
  
  public final AdSize[] getAdSizes()
  {
    return zzoJ.getAdSizes();
  }
  
  public final String getAdUnitId()
  {
    return zzoJ.getAdUnitId();
  }
  
  public final AppEventListener getAppEventListener()
  {
    return zzoJ.getAppEventListener();
  }
  
  public final String getMediationAdapterClassName()
  {
    return zzoJ.getMediationAdapterClassName();
  }
  
  public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
  {
    return zzoJ.getOnCustomRenderedAdLoadedListener();
  }
  
  public final boolean isLoading()
  {
    return zzoJ.isLoading();
  }
  
  public final void loadAd(PublisherAdRequest paramPublisherAdRequest)
  {
    zzoJ.zza(paramPublisherAdRequest.zzaE());
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      int i = localView.getMeasuredWidth();
      int j = localView.getMeasuredHeight();
      paramInt1 = (paramInt3 - paramInt1 - i) / 2;
      paramInt2 = (paramInt4 - paramInt2 - j) / 2;
      localView.layout(paramInt1, paramInt2, i + paramInt1, j + paramInt2);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Object localObject = getChildAt(0);
    int j;
    if ((localObject != null) && (((View)localObject).getVisibility() != 8))
    {
      measureChild((View)localObject, paramInt1, paramInt2);
      j = ((View)localObject).getMeasuredWidth();
      i = ((View)localObject).getMeasuredHeight();
    }
    for (;;)
    {
      j = Math.max(j, getSuggestedMinimumWidth());
      i = Math.max(i, getSuggestedMinimumHeight());
      setMeasuredDimension(View.resolveSize(j, paramInt1), View.resolveSize(i, paramInt2));
      return;
      localObject = getAdSize();
      if (localObject != null)
      {
        Context localContext = getContext();
        j = ((AdSize)localObject).getWidthInPixels(localContext);
        i = ((AdSize)localObject).getHeightInPixels(localContext);
      }
      else
      {
        j = 0;
      }
    }
  }
  
  public final void pause()
  {
    zzoJ.pause();
  }
  
  public final void recordManualImpression()
  {
    zzoJ.recordManualImpression();
  }
  
  public final void resume()
  {
    zzoJ.resume();
  }
  
  public final void setAdListener(AdListener paramAdListener)
  {
    zzoJ.setAdListener(paramAdListener);
  }
  
  public final void setAdSizes(AdSize... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0)) {
      throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }
    zzoJ.zza(paramVarArgs);
  }
  
  public final void setAdUnitId(String paramString)
  {
    zzoJ.setAdUnitId(paramString);
  }
  
  public final void setAppEventListener(AppEventListener paramAppEventListener)
  {
    zzoJ.setAppEventListener(paramAppEventListener);
  }
  
  public final void setCorrelator(Correlator paramCorrelator)
  {
    zzoJ.setCorrelator(paramCorrelator);
  }
  
  public final void setManualImpressionsEnabled(boolean paramBoolean)
  {
    zzoJ.setManualImpressionsEnabled(paramBoolean);
  }
  
  public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener paramOnCustomRenderedAdLoadedListener)
  {
    zzoJ.setOnCustomRenderedAdLoadedListener(paramOnCustomRenderedAdLoadedListener);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.doubleclick.PublisherAdView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */