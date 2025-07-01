using System;
using System.Collections.Generic;

namespace BlackJackTest
{
    class Program
    {
        static void Main(string[] args)
        {
            //==================================変数宣言==================================
            List<int> card = new List<int>();
            for (int i = 0; i < 52; i++)
            {
                card.Add(i);
            }
            int[] totalScores = { 0, 0 };
            Random random = new Random();
            Program pro = new Program();
            const int playerNum = 0;
            const int dealerNum = 1;

            //================================ゲーム本体処理================================

            Console.WriteLine("ブラックジャックを開始します！\n");

            // 最初のカード配布
            Console.WriteLine("-----------------最初のカード配布-----------------");
            pro.DrawCard(playerNum, card, totalScores, random);
            pro.DrawCard(playerNum, card, totalScores, random);
            pro.DrawCard(dealerNum, card, totalScores, random);

            // プレイヤーの合計スコア表示
            Console.WriteLine($"\nあなたの合計スコア: {totalScores[playerNum]}");

            Console.WriteLine("\n-----------------プレイヤーターン-----------------");

            int answerType = 0;
            const int yes = 1;
            const int no = 2;

            do
            {
                do
                {
                    answerType = 0;
                    Console.WriteLine("カードを引きますか? Y / N");
                    string answer = Console.ReadLine();

                    if ("y".Equals(answer, StringComparison.OrdinalIgnoreCase))
                    {
                        answerType = yes;
                        Console.WriteLine("カードを引きます");
                        pro.DrawCard(playerNum, card, totalScores, random);
                    }
                    else if ("n".Equals(answer, StringComparison.OrdinalIgnoreCase))
                    {
                        answerType = no;
                    }
                } while (answerType == 0);

                if (totalScores[playerNum] > 21)
                {
                    Console.WriteLine("【勝敗結果】\n「21を超えたので、プレイヤーの負けです・・・。」\n");
                    Environment.Exit(0);
                }

            } while (answerType == yes);

            Console.WriteLine("\n-----------------ディーラーターン-----------------");

            while (totalScores[dealerNum] <= 16)
            {
                pro.DrawCard(dealerNum, card, totalScores, random);
            }

            Console.WriteLine("\n【勝敗結果】\n");
            Console.WriteLine($"あなたのスコア: {totalScores[playerNum]}");
            Console.WriteLine($"ディーラーのスコア: {totalScores[dealerNum]}");

            if (totalScores[playerNum] == 21 && totalScores[dealerNum] != 21)
            {
                Console.WriteLine("あなたの勝ちです");
            }
            else if (totalScores[dealerNum] == 21 && totalScores[playerNum] != 21)
            {
                Console.WriteLine("あなたの負けです");
            }
            else if (totalScores[playerNum] <= 21 && (totalScores[dealerNum] > 21 || totalScores[playerNum] > totalScores[dealerNum]))
            {
                Console.WriteLine("あなたの勝ちです");
            }
            else if (totalScores[dealerNum] <= 21 && (totalScores[playerNum] > 21 || totalScores[dealerNum] > totalScores[playerNum]))
            {
                Console.WriteLine("あなたの負けです");
            }
            else
            {
                Console.WriteLine("引き分けです");
            }
        }

        /// <summary>
        /// カードを引く処理（見た目の改善含む）
        /// </summary>
        private void DrawCard(int turnNum, List<int> cards, int[] totalScores, Random random)
        {
            string[] suits = { "♠", "♥", "♦", "♣" };

            int cardIndex = random.Next(cards.Count);
            int cardNumber = cards[cardIndex];
            cards.RemoveAt(cardIndex);

            int suit = cardNumber / 13;
            int number = cardNumber % 13 + 1;
            int cardValue = number;

            if (cardValue > 10)
            {
                cardValue = 10;
            }
            else if (cardValue == 1)
            {
                cardValue = (totalScores[turnNum] + 11 <= 21) ? 11 : 1;
            }

            totalScores[turnNum] += cardValue;

            string playerName = (turnNum == 0) ? "プレイヤー" : "ディーラー";
            Console.WriteLine($"{playerName}が引いたカード: {suits[suit]}{number} / 得点: {cardValue}");
            Console.WriteLine($"{playerName}の合計スコア: {totalScores[turnNum]}\n");
        }
    }
}
