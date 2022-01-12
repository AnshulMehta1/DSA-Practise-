or(int i=0; i<prices.length; i++) {
            for(int j=i+1; j<prices.length; j++) {
                if(prices[j] > prices[i]) continue;
                prices[i] -= prices[j];
                break;
            }
        }
        return prices;
